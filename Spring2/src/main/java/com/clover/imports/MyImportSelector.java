package com.clover.imports;

import com.clover.beans.OtherBean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //参数annotationMetadata叫做注解媒体数组，该对象内部封装是当前使用了@Import注解的类上的其他注解的元信息
        //返回的是所有bean的包名
        return new String[]{
            OtherBean.class.getName()
        };
    }
}
