/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	flowable-demo
 * 文件名：	OrderTaskRelationRepository.java
 * 模块说明：
 * 修改历史：
 * 2021/2/6 - seven - 创建。
 */
package com.seven.flowable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author seven
 */
@Repository
public interface OrderTaskRelationRepository extends JpaRepository<POrderTaskRelation, String> {
  POrderTaskRelation findByOrderId(String orderId);

  List<POrderTaskRelation> findByExecutionIdIn(List<String> executionIds);
}
