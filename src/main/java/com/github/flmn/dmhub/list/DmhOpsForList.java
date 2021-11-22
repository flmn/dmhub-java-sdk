package com.github.flmn.dmhub.list;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.common.DmhOps;
import com.github.flmn.dmhub.list.dto.DmhExternalListsRequest;
import com.github.flmn.dmhub.list.dto.DmhExternalListsResult;
import com.github.flmn.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DmhOpsForList extends DmhOps {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final DmHubApi api;
    private final DmhListInterface listInterface;

    public DmhOpsForList(DmHubApi api) {
        super(api);
        this.api = api;
        this.listInterface = api.create(DmhListInterface.class);
    }

    @SuppressWarnings("unchecked")
    public DmhExternalListsResult importExternalLists(List<String> lists) {
        DmhExternalListsRequest request = new DmhExternalListsRequest();
        request.setLists(lists);
        Call<Map<String, Object>> call = listInterface.externalLists(api.getAccessToken(), request);

        Map<String, Object> map = mapResult(call, "importExternalLists");

        DmhExternalListsResult result = new DmhExternalListsResult();
        result.setCode(StringUtils.toString(map.getOrDefault("code", ""), false));
        result.setSuccess((List<String>) map.getOrDefault("success", Collections.emptyList()));
        result.setFailed((List<String>) map.getOrDefault("failed", Collections.emptyList()));

        return result;
    }
}
