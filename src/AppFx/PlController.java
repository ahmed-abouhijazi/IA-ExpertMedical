/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFx;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import org.jpl7.*;
/**
 *
 * @author ahmed
 */
public class PlController {
    public String Finder(){
        String[] Malade ={"measles ","german_measles","flu","common_cold","mumps","chicken_pox"};
        Query q = new Query("consult('maladies_pulmonaires.pl')");
        q.hasSolution();
        for(int j = 0;j<Malade.length;j++){
            q = new Query("symptome(X,"+Malade[j]+").");
            Map<String, Term>[] res = q.allSolutions();
            for(int i=0;i<res.length;i++){
                ArrayList<String> Msymptoms =new ArrayList<String>();
                String tf = ""+res[i];
                String[] st = tf.split("=");
        
                String[] st1=st[1].split("}");
                Msymptoms.add(st1[0]);
                
            }
            
        }
        return null;
    }
}
