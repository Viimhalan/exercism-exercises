import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> newCol = new HashSet<>();
        for(String card : cards){
            newCol.add(card);
        }
        return newCol;
        //throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.newCollection() method");
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
        //throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.addCard() method");
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean canTrade = false;
        if(myCollection.size() != 0 && theirCollection.size() != 0 && myCollection.size() == theirCollection.size()){
            for(String card: myCollection){
                if(theirCollection.contains(card) == false){
                    canTrade = true;
                    break;
                }
            }
        }
        return canTrade;
        //throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.canTrade() method");
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> comCard = new HashSet<>();
        comCard.addAll(allCards(collections));
        for(Set<String> col: collections){
            comCard.retainAll(col);
        }
        return comCard;
        //throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.commonCards() method");
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> comCard = new HashSet<>();
        for(Set<String> col: collections){
            comCard.addAll(col);
        }
        return comCard;
        //throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.allCards() method");
    }
}
