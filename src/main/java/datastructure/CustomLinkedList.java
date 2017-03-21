package datastructure;

import java.util.List;

/**
 * Created by rajib.khan on 3/19/17.
 */
public class CustomLinkedList {

      Node start = null;
      Node end = null;

      public void add(Object data) {
          Node current = new Node(data);
          if (start == null) {
              this.start = current;
          } else if (end == null) {
              this.end = current;
          } else {

          }

      }

      public void remove() {

      }

      public void size() {

      }
}
