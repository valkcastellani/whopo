package com.valkcastellani.whopo;

import com.valkcastellani.whopo.WhopoApp;
import com.valkcastellani.whopo.config.AsyncSyncConfiguration;
import com.valkcastellani.whopo.config.EmbeddedElasticsearch;
import com.valkcastellani.whopo.config.EmbeddedKafka;
import com.valkcastellani.whopo.config.EmbeddedSQL;
import com.valkcastellani.whopo.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { WhopoApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
