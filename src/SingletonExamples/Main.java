//package SingletonExamples;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//       ConnectionPool connectionPool=  ConnectionPoolImpl.getInstance(10);
//
//        SingletonExamples.DatabaseConnection connection1 = connectionPool.getConnection();
//        System.out.println("Available connections after acquiring one: " + connectionPool.getAvailableConnectionsCount());
//
//        // Acquire another connection from the pool
//        DatabaseConnection connection2 = connectionPool.getConnection();
//        System.out.println("Available connections after acquiring another: " + connectionPool.getAvailableConnectionsCount());
//
//        // Release a connection back to the pool
//        connectionPool.releaseConnection(connection1);
//        System.out.println("Available connections after releasing one: " + connectionPool.getAvailableConnectionsCount());
//
//        // Release another connection back to the pool
//        connectionPool.releaseConnection(connection2);
//        System.out.println("Available connections after releasing another: " + connectionPool.getAvailableConnectionsCount());
//
//        // Reset the instance (for testing purposes, optional)
//        ConnectionPoolImpl.resetInstance();
//    }
//}
