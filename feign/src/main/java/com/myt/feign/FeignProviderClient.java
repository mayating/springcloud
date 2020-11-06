package com.myt.feign;

import com.myt.entity.Student;
import com.myt.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @program: springcloud
 * @description:
 * @author: Ma YaTing
 * @create: 2020-11-06 19:46
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}

