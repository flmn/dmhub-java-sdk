package com.github.flmn.dmhub.list;

import com.github.flmn.dmhub.BaseTest;
import com.github.flmn.dmhub.list.dto.DmhExternalListsResult;
import org.junit.jupiter.api.Test;

import java.util.Collections;

class DmhOpsForListTest extends BaseTest {

    @Test
    public void importExternalLists() {
        DmhOpsForList ops = dmHubApi.opsForList();

        DmhExternalListsResult result = ops.importExternalLists(Collections.singletonList("测试群组"));

        System.out.println(result);
    }
}