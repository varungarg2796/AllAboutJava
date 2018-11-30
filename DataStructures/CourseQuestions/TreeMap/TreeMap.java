package project;

import java.util.Iterator;


public class TreeMap<K, V> implements Map<Comparable<K>, V> {

	//Inner Class TreeEntry implements Entry and Comparable
    private class TreeEntry<K, V> implements Entry<K, V>, Comparable<K> {

        private K key;
        private V value;

        //Constructor to initialize
        public TreeEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        //Compare method
        @Override
        public int compareTo(K otherKey) {
            if (this.key.equals(otherKey)) {
                return 0;
            }   
            else {
                return -1;
            }
        }

        
        //Getting the value
        public V value() {
            
            return value;
        }


        // Getting the key value
        public K key() {
            
            return key;
        }

        //Getting the graphical representation
        public String toString() {
        	
        	return "<" +key + "," + value + ">";
        }

    }
    
   

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Comparable<K> k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(Comparable<K> k, V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(Comparable<K> k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Comparable<K>> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Entry<Comparable<K>, V>> entries() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		
	}
}