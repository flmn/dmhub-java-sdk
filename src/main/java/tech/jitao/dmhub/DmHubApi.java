package tech.jitao.dmhub;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class DmHubApi {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final DmHubApiConfiguration cfg;
    private DmHubApiInterface dmHubApiInterface;

    public DmHubApi(DmHubApiConfiguration cfg) {
        this.cfg = cfg;
    }

    public void init() {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(cfg.getServerUrl())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .build();

        this.dmHubApiInterface = retrofit.create(DmHubApiInterface.class);
    }
}
