package com.assetmanagement.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.assetmanagement.entity.Asset;
import com.assetmanagement.entity.Order;
import com.assetmanagement.entity.OrderItem;
import com.assetmanagement.entity.User;
import com.assetmanagement.entity.Warehouse;
import com.assetmanagement.repository.OrderItemRepository;

@SpringBootTest
public class OrderItemServiceTest {

 @InjectMocks
private OrderItemService orderItemService=new OrderItemServiceImpl();
@Mock
private OrderItemRepository orderItemRepository;

 @Test
public void testgetOrderItemById() {
Warehouse warehouse = new Warehouse();
warehouse.setWarehouseId(1);
warehouse.setWarehouseLocation("Banglore");
warehouse.setWarehouseName("Arshad's warehouse");

 Warehouse warehouse1 = new Warehouse();
warehouse1.setWarehouseId(2);
warehouse1.setWarehouseLocation("Hyderabad");
warehouse1.setWarehouseName("bangs warehouse");

 User user = new User();
user.setAddress("Banglore");
user.setEmailId("aaa@gmail.com");
user.setMobileNumber(756773836);
user.setPassword("AAA12");
user.setUserId(1);
user.setUserName("AAA");

OrderItem orderItem = new OrderItem();
orderItem.setAssetId(1);
orderItem.setQuantity(3);

 Set<OrderItem> orderItems = new HashSet<>();

Order order = new Order();
order.setFromWarehouseId(1);
order.setOrderDate(LocalDate.now());
order.setOrderitems(orderItems);

 orderItem.setOrder(order);

orderItems.add(orderItem);
order.setFromWarehouseId(1);
order.setToWarehouseId(2);
order.setUser(user);
order.setOrderId(1);

 Set<Order> listOfOrder = new HashSet<>();
listOfOrder.add(order);
user.setGetListOfOrders(listOfOrder);

 Asset asset=new Asset();
asset.setAssetName("vidhya");
asset.setAssetPrice(900.00);
asset.setManufacturer("dfgfjh");
asset.setAssetCategory("fgguj");
asset.setAssetType("ahg");

Optional<OrderItem> optionOrderItem=Optional.of(orderItem);
when(orderItemRepository.findById(1)).thenReturn(optionOrderItem);
OrderItem myOrderItem=orderItemService.getOrderItemById(1);
assertEquals(1,myOrderItem.getAssetId());

orderItemService.getOrderItemById(1);
}
}