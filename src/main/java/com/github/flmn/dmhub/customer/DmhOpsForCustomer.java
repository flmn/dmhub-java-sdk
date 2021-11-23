package com.github.flmn.dmhub.customer;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.common.DmhOps;
import com.github.flmn.dmhub.common.dto.DmhData;
import com.github.flmn.dmhub.common.dto.DmhResult;
import com.github.flmn.dmhub.customer.dto.*;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import com.github.flmn.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public final class DmhOpsForCustomer extends DmhOps {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final DmHubApi api;
    private final DmhCustomerInterface customerInterface;

    public DmhOpsForCustomer(DmHubApi api) {
        super(api);
        this.api = api;
        this.customerInterface = api.create(DmhCustomerInterface.class);
    }

    // ******************** 客户 ********************

    public DmhCustomer createCustomer(DmhCreateCustomerRequest request, boolean forceUpdate) {
        Call<DmhCustomer> call = customerInterface.customers(api.getAccessToken(),
                forceUpdate,
                request);

        return result(call, "createCustomer");
    }

    public DmhResult bulkCreateCustomer(List<DmhCreateCustomerRequest> request, boolean forceUpdate) {
        Call<DmhResult> call = customerInterface.customersBulkAdd(api.getAccessToken(),
                forceUpdate,
                request);

        return result(call, "bulkCreateCustomer");
    }

    public DmhData<DmhCustomer> listCustomers(String select,
                                              String sort,
                                              Integer limit,
                                              Long id,
                                              ZonedDateTime dateJoin,
                                              ZonedDateTime lastUpdated,
                                              String stage,
                                              String mobile,
                                              String email) throws DmHubSdkException {
        Call<DmhData<DmhCustomer>> call = customerInterface.customers(api.getAccessToken(),
                select,
                sort,
                limit,
                id,
                dateJoin,
                lastUpdated,
                stage,
                mobile,
                email);

        return result(call, "listCustomers");
    }

    public DmhCustomer findCustomerByIdentity(String identityType, String identityValue) {
        Call<DmhCustomer> call = customerInterface.customerServiceFindCustomerByIdentity(api.getAccessToken(),
                identityType,
                identityValue);

        return result(call, "findCustomerByIdentity");
    }

    public String customerIdToClCid(Long customerId) {
        Call<DmhIdMappingResult> call = customerInterface.customerServiceIdMapping(api.getAccessToken(),
                customerId,
                null);

        DmhIdMappingResult result = result(call, "customerIdToClCid");

        return result.getClCid();
    }

    public Long clCidToCustomerId(String clCid) {
        Call<DmhIdMappingResult> call = customerInterface.customerServiceIdMapping(api.getAccessToken(),
                null,
                clCid);

        DmhIdMappingResult result = result(call, "clCidToCustomerId");

        return result.getCustomerId();
    }

    /**
     * 添加客户身份
     *
     * @param customerId 客户ID
     * @param type       身份类型
     * @param value      身份值
     */
    public DmhCustomerIdentity createIdentity(long customerId, String type, String value) {
        DmhCreateIdentityRequest request = new DmhCreateIdentityRequest();
        request.setCustomerId(customerId);
        request.setType(type);
        request.setValue(value);

        Call<DmhCustomerIdentity> call = customerInterface.createIdentity(api.getAccessToken(),
                request);

        return result(call, "createIdentity");
    }

    public List<DmhCustomerIdentity> bulkGetIdentities(List<Long> customerIds) {
        DmhBulkGetByCustomerIdRequest request = new DmhBulkGetByCustomerIdRequest();
        request.setCustomerIds(customerIds);

        Call<DmhBulkGetByCustomerIdResult> call = customerInterface.bulkGetByCustomerId(api.getAccessToken(),
                request);

        DmhBulkGetByCustomerIdResult result = result(call, "bulkGetIdentities");

        if (result != null && result.hasError()) {
            logger.warn("bulkGetIdentities error, {}", result);

            return Collections.emptyList();
        }

        return result.getData();
    }

    public PushInfoRegisterResult registerPushInfo(PushInfoRegisterRequest request, String identityPriorityStrategy) {
        if (StringUtils.isBlank(identityPriorityStrategy)) {
            identityPriorityStrategy = "system";
        }

        Call<PushInfoRegisterResult> call = customerInterface.pushInfoRegister(api.getAccessToken(), identityPriorityStrategy, request);

        return result(call, "registerPushInfo");
    }

    public List<PushInfoRegisterResult> getPushInfoByCustomerIdentity(String identityType, String identityValue) {
        Call<PushInfoGetByCustomerIdentityResult> call = customerInterface.pushInfoGetByCustomerIdentity(api.getAccessToken(), identityType, identityValue);

        PushInfoGetByCustomerIdentityResult result = result(call, "getPushInfoByCustomerIdentity");

        if (result == null) {
            return Collections.emptyList();
        }

        return result.getData();
    }
}
