public class DelegateAlreadyExists {
    private interface SimpleCollection {
        boolean add(String item);
        boolean remove(Object item);
    }
    
	String hello;
	int world;

    @lombok.experimental.Delegate(types=SimpleCollection.class)
    private final java.util.List<String> collection = new java.util.ArrayList<String>();
    
	public boolean remove(final java.lang.Object item) {
		System.out.println("remove was called");
		return this.collection.remove(item);
	}
}
