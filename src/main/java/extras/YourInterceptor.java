package extras;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.springframework.stereotype.Component;

import ca.uhn.fhir.interceptor.api.Hook;
import ca.uhn.fhir.interceptor.api.Interceptor;
import ca.uhn.fhir.interceptor.api.Pointcut;

@Component
@Interceptor
public class YourInterceptor
{
    @Hook(Pointcut.STORAGE_PRECOMMIT_RESOURCE_CREATED)
    public void resourceCreated(IBaseResource newResource)
    {
        System.out.println("YourInterceptor.resourceCreated");
    }
}