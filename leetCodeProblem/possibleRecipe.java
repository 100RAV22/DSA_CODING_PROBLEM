// problem no. - 2115
import java.util.*;
class possibleRecipe{
    public static void main(String args[]){
        String recipes[] = {"bread","sandwich"};
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(new ArrayList(Arrays.asList("yeast","flour")));
        ingredients.add(new ArrayList(Arrays.asList("bread","meat")));
        String supplies[] = {"yeast","flour","meat"};
        List<String> res = AllPossibleRecipe(recipes, ingredients, supplies);
        for(String s: res){
            System.out.print(s+" ");
        }
    }
    public static List<String> AllPossibleRecipe(String recipes[], List<List<String>> ingredients, String supplies[]){
        List<String> result = new ArrayList<>();
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        HashMap<String,List<String>> graph = new HashMap<>();
        HashMap<String, Integer> indegree = new HashMap<>();

        for(int i=0;i<recipes.length;i++){
            String recipe = recipes[i];
            indegree.put(recipe,ingredients.get(i).size());

            for(String ingredient: ingredients.get(i)){
                graph.computeIfAbsent(ingredient, k->new ArrayList()).add(recipe);
            }
        }

        Queue<String> queue = new LinkedList<>(available);
        while(!queue.isEmpty()){
            String item = queue.poll();
            if(!graph.containsKey(item)){
                continue;
            }
            for(String recipe : graph.get(item)){
                indegree.put(recipe, indegree.get(recipe)-1);
                if(indegree.get(recipe)==0){
                    result.add(recipe);
                    queue.add(recipe);
                }
            }
        }
        return result;
    }
}