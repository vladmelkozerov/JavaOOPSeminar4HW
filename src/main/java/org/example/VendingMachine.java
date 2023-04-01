package org.example;

public class VendingMachine <T> {
     T order;

     public T getOrder() {
          return order;
     }

     public void setOrder(T order) {
          this.order = order;
     }

     public VendingMachine() {
          this.order = order;
     }
}
