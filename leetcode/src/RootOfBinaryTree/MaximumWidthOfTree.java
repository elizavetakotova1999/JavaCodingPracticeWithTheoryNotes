package RootOfBinaryTree;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


//Definition for a binary tree node.


class MaximumWidthOfTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxWidth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> positionMap = new HashMap<>();

        queue.offer(root);
        positionMap.put(root, 1);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Кількість вузлів на поточному рівні
            int leftmostPos = positionMap.get(queue.peek()); // Позиція найлівішого вузла на поточному рівні
            int rightmostPos = leftmostPos; // Початково права позиція дорівнює лівій позиції

            // Обхід вузлів на поточному рівні
            for (int i = 0; i < levelSize; i++) {
                RootOfBinaryTree.TreeNode  node = (RootOfBinaryTree.TreeNode) queue.poll();
                int nodePos = positionMap.get(node);
                rightmostPos = nodePos; // Оновлюємо праву позицію на кожному кроці

                // Додаємо ліве дитя до черги та встановлюємо його позицію
                assert node != null;
                if (node.left != null) {
                    queue.offer((TreeNode) node.left);
                    positionMap.put((TreeNode) node.left, 2 * nodePos);
                }

                // Додаємо праве дитя до черги та встановлюємо його позицію
                if (node.right != null) {
                    queue.offer((TreeNode) node.right);
                    positionMap.put((TreeNode) node.right, 2 * nodePos + 1);
                }
            }

            int currentWidth = rightmostPos - leftmostPos + 1; // Ширина поточного рівня
            maxWidth = Math.max(maxWidth, currentWidth); // Оновлюємо максимальну ширину, якщо поточна ширина більша
        }

        return maxWidth;
    }
}
