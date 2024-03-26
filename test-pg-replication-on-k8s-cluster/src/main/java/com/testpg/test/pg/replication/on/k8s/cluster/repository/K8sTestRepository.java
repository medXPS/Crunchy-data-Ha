package com.testpg.test.pg.replication.on.k8s.cluster.repository;

import com.testpg.test.pg.replication.on.k8s.cluster.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface K8sTestRepository extends JpaRepository<Item,Long> {
}
