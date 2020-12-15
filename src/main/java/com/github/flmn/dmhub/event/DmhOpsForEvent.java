package com.github.flmn.dmhub.event;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.common.DmhOps;
import com.github.flmn.dmhub.event.dto.DmhEvent;
import retrofit2.Call;

import java.util.Map;

public final class DmhOpsForEvent extends DmhOps {
    private final DmhEventInterface eventInterface;

    public DmhOpsForEvent(DmHubApi api) {
        super(api);
        this.eventInterface = api.create(DmhEventInterface.class);
    }

    // ******************** 客户事件 ********************

    public DmhEvent createEvent(DmhEvent event, boolean trackIp) {
        event.setId(null);

        Call<Map<String, Object>> call = eventInterface.customerEvents(api.getAccessToken(), trackIp, event.toMap());

        Map<String, Object> result = mapResult(call, "createEvent");

        if (result == null) {
            return null;
        }

        return new DmhEvent(result);
    }
}
