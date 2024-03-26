package com.testpg.test.pg.replication.on.k8s.cluster.controller;


import com.testpg.test.pg.replication.on.k8s.cluster.entity.Item;
import com.testpg.test.pg.replication.on.k8s.cluster.service.K8sTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/items")
    public class K8sTestController {

    private final K8sTestService service;

    @Autowired
    public K8sTestController(K8sTestService service) {
        this.service = service;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return service.saveItem(item);
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return service.getItem(id);
    }

}