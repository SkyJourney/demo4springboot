package com.example.demo4springboot;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

//@Configuration(proxyBeanMethods = false)
//@Import(TestConfig.BeanPostProcessorsRegistrar.class)
public class TestConfig {

    public static class BeanPostProcessorsRegistrar implements ImportBeanDefinitionRegistrar {

        @Override
        public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Test.class);
            registry.registerBeanDefinition(Test.class.getSimpleName().toLowerCase(),beanDefinition);
        }

    }

}
