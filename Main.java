import java.util.ArrayList;

public static void main(String[] args) {

    // 1 — Add vertices (using names for readability)
    List<String> vertices = Arrays.asList(
       "Liberal Arts",                 // (vertic 0)
            "Student Services",             // (vertice 1)
            "Health Careers & Sciences",    // (vertice 2)
            "Health Technologies Center",   // (vertice 3)
            "Recreation Center",            // (vertice 4)
            "Technology Learning Center",   // (vertice 5)
            "Business & Technology",        // (vertice 6)
            "Theatre"                       // (vertice 7)
    );

    // 3- Add edges based on the campus map
    
    List<int[]> edges = new ArrayList<>();

    // Liberal Arts connections
    edges.add(new int[]{0, 1});   // Liberal Arts ↔ Student Services
    edges.add(new int[]{0, 2});   

    // Student Services connections
    edges.add(new int[]{1, 2});   // Student Services ↔ Health Careers
    edges.add(new int[]{1, 7});   // Student Services ↔ Theatre

    // Health Careers & Sciences connections
    edges.add(new int[]{2, 3});   // Health Careers & Sciences ↔ Health Technologies Center
    edges.add(new int[]{2, 5});   // HCS ↔ Tech Learning Center

    // Health Technologies Center connections
    edges.add(new int[]{3, 4});   // Health Technologies Center ↔ Recreation Center

    // Recreation Center connections
    edges.add(new int[]{4, 5});   // Rec ↔ Tech Learning Center

    // Technology Learning Center connections
    edges.add(new int[]{5, 6});   // TLC ↔ Business & Tech

    // Business & Technology connections
    edges.add(new int[]{6, 7});   // B&T ↔ Theatre
    

    
    // 3 — Create the graph  using the vertices and edges
    int[][] edgeArray = edges.toArray(new int[0][]);
    Graph<String> graph = new UnweightedGraph<>(vertices.toArray(new String[0]), edgeArray);

   
    // 4 — Perform DFS starting from Business & Technology (vertex 6)
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);
    

    // 5 — Print DFS search order
    System.out.println("DFS Search Order:");
    List<Integer> searchOrder = dfs.getSearchOrder();
    for (int v : searchOrder) {
        System.out.println(v + ": " + graph.getVertex(v));
    }

    // 6 — Print parent-child relationships
    System.out.println("\nParent Relationships:");
    for (int i = 0; i < vertices.size(); i++) {
        int parent = dfs.getParent(i);
        System.out.println("Vertex " + i + " (" + graph.getVertex(i) + ")"
                + " — Parent: " + parent);
    }

    // 7 — Print paths from Business & Technology (6) to:
    System.out.println("\nPaths from Business & Technology:");

    System.out.print("To Health Technologies Center: ");
    dfs.printPath(3);

    System.out.print("To Student Services: ");
    dfs.printPath(1);

    System.out.print("To Recreation Center: ");
    dfs.printPath(4);

    // 8-print the entire tree
    System.out.println("\nDFS Tree:");
    dfs.printTree();
}
