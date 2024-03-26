package com.testpg.test.pg.replication.on.k8s.cluster.service;

import com.testpg.test.pg.replication.on.k8s.cluster.entity.Item;
import com.testpg.test.pg.replication.on.k8s.cluster.repository.K8sTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class K8sTestServiceImpl implements  K8sTestService{
    private final K8sTestRepository repository;

    @Autowired
    public K8sTestServiceImpl(K8sTestRepository repository) {
        this.repository = repository;
    }

    @Override
    public Item saveItem(Item item) {
        return repository.save(item);
    }

    @Override
    public Item getItem(Long id) {
        return repository.findById(id).orElse(null);
    }
}
