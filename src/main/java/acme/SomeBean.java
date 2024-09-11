package acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.openapi.quarkus.sample_api_json.api.DefaultApi;

@ApplicationScoped
public class SomeBean {

    @RestClient
    DefaultApi defaultApi;

}
