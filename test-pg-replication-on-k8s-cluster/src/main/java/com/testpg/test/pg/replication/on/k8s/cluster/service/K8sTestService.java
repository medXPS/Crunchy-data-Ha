package com.testpg.test.pg.replication.on.k8s.cluster.service;

import com.testpg.test.pg.replication.on.k8s.cluster.entity.Item;

public interface K8sTestService {
    Item saveItem(Item item);
    Item getItem(Long id);
}
