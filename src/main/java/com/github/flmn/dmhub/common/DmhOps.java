package com.github.flmn.dmhub.common;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.common.dto.DmhResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Map;

public abstract class DmhOps {
    protected final DmHubApi api;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected DmhOps(DmHubApi api) {
        this.api = api;
    }

    // 结果检查
    protected <T extends DmhResult> T result(Call<T> call, String func) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                logger.info("{}, code={}, message={}", func, response.code(), response.message());

                return response.body();
            } else {
                logger.warn("{} not successful, code={}, message={}", func, response.code(), response.message());

                return null;
            }
        } catch (IOException e) {
            logger.warn("{}, IOException, message={}", func, e.getMessage());

            return null;
        }
    }

    protected Map<String, Object> mapResult(Call<Map<String, Object>> call, String func) {
        try {
            Response<Map<String, Object>> response = call.execute();
            if (response.isSuccessful()) {
                logger.info("{}, code={}, message={}", func, response.code(), response.message());

                return response.body();
            } else {
                logger.warn("{} not successful, code={}, message={}", func, response.code(), response.message());

                return null;
            }
        } catch (IOException e) {
            logger.warn("{}, IOException, message={}", func, e.getMessage());

            return null;
        }
    }
}
