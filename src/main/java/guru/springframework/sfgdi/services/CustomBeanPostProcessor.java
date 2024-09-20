package guru.springframework.sfgdi.services;

import org.springframework.beans.*;
import org.springframework.beans.factory.config.*;
import org.springframework.stereotype.*;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
