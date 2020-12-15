package com.github.flmn.dmhub.customer;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.common.DmhOps;
import com.github.flmn.dmhub.common.dto.DmhData;
import com.github.flmn.dmhub.common.dto.DmhResult;
import com.github.flmn.dmhub.customer.dto.DmhCreateCustomerRequest;
import com.github.flmn.dmhub.customer.dto.DmhCustomer;
import com.github.flmn.dmhub.customer.dto.DmhIdMappingResult;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import retrofit2.Call;

import java.time.ZonedDateTime;
import java.util.List;

public final class DmhOpsForCustomer extends DmhOps {
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
}
