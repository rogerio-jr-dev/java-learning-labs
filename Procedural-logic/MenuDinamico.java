import java.util.*;

class MenuItem {
    private String text;
    private String route;

    public MenuItem(String text, String route) {
        this.text = text;
        this.route = (route == null || route.isEmpty()) ? null : route;
    }

    public String getText() {
        return text;
    }

    public String getRoute() {
        return route;
    }
}

class GenericTree<T> {
    private TreeNode<T> root;

    public GenericTree(T value) {
        this.root = new TreeNode<>(value);
    }

    public TreeNode<T> getRoot() {
        return root;
    }
}

class TreeNode<T> {
    private T value;
    private List<TreeNode<T>> children = new ArrayList<>();

    public TreeNode(T value) {
        this.value = value;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public T getValue() {
        return value;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }
}

public class MenuDinamico {

    static GenericTree<MenuItem> generateTree(String[] records) {

        Map<Long, TreeNode<MenuItem>> mapa = new HashMap<>();

        String[] rootFields = records[0].split(",", -1);  

        long rootId = Long.parseLong(rootFields[0]);
        String rootText = rootFields[1];
        MenuItem rootItem = new MenuItem(rootText, null);

        GenericTree<MenuItem> tree = new GenericTree<>(rootItem);
        mapa.put(rootId, tree.getRoot());

        for (int i = 1; i < records.length; i++) {

            String[] fields = records[i].split(",", -1);

            long id = Long.parseLong(fields[0]);
            String text = fields[1];
            String route = fields[2];
            String parentRaw = fields[3];

            long parentId = Long.parseLong(parentRaw);

            MenuItem item = new MenuItem(text, route);
            TreeNode<MenuItem> node = new TreeNode<>(item);

            TreeNode<MenuItem> parentNode = mapa.get(parentId);
            parentNode.addChild(node);

            mapa.put(id, node);
        }

        return tree;
    }
    static void printTree(TreeNode<MenuItem> node) {
        MenuItem m = node.getValue();
        System.out.println(m.getText() + " (" + m.getRoute() + ")");
        for (TreeNode<MenuItem> child : node.getChildren()) {
            printTree(child);
        }
    }

    public static void main(String[] args) {

        String[] entrada1 = {
            "31,Site de investimentos,,",
            "33,Notícias,,31",
            "47,Nacionais,/noticias-nacionais,33",
            "49,Internacionais,/noticias-internacionais,33",
            "53,Economia,,31",
            "57,Bolsa de valores,,53",
            "61,Ações,/acoes,57",
            "65,Fundos imobiliários,/fii,57",
            "72,Indicadores,/indicadores,53",
            "75,Blog,/blog,53"
        };
 
        GenericTree<MenuItem> arvore1 = generateTree(entrada1);
        printTree(arvore1.getRoot());

 
    }
}
