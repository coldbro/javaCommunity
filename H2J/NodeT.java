package H2J;

//假设通过二叉树对如下10个随机数进行排序
//        67,7,30,73,10,0,78,81,10,74
//        排序的第一个步骤是把数据插入到该二叉树中
//        插入基本逻辑是，小、相同的放左边，大的放右边

import java.util.ArrayList;
import java.util.List;

public class NodeT {
    //    public static void main(String[] args) {
    public NodeT rightNode;
    public NodeT leftNode;
    public Object value;

    public void add(Object v) {
        if (null == value) {
            value = v;
        } else {
            if (((Integer) value - (Integer) v) >= 0) {
                if (null == leftNode)
                    leftNode = new NodeT();
                leftNode.add(v);
            } else {
                if (null == rightNode)
                    rightNode = new NodeT();
                rightNode.add(v);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        NodeT roots = new NodeT();
        for (int number : array) {
            roots.add(number);
        }
        System.out.println(roots.values());
    }

    //    通过上一个步骤的插入行为，实际上，数据就已经排好序了。 接下来要做的是看，把这些已经排好序的数据，遍历成我们常用的List或者数组的形式
//
//    二叉树的遍历分左序，中序，右序
//    左序即： 中间的数遍历后放在左边
//    中序即： 中间的数遍历后放在中间
//    右序即： 中间的数遍历后放在右边
//    如图所见，我们希望遍历后的结果是从小到大的，所以应该采用中序遍历
    public List<Object> values() {
        var values = new ArrayList();
        if (null != leftNode) {
            values.addAll(leftNode.values());
        }
        values.add(value);
        if (null != rightNode) {
            values.addAll(rightNode.values());
        }
        return values;
    }

}

