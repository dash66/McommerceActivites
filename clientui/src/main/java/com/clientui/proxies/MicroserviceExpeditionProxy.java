package com.clientui.proxies;

import com.clientui.beans.ExpeditionBean;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-expedition")
public interface MicroserviceExpeditionProxy {

    @PostMapping("/expeditions")
    public ResponseEntity<Void> ajouterUneExpedition(@RequestBody ExpeditionBean expedition);

    @GetMapping(value = "/expeditions/{id}")
    public Optional<ExpeditionBean> etatExpedition(@PathVariable("id") int id);

}
