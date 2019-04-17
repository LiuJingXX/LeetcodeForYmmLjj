package Ljj.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZH1 {
    public static void main(String[] args) {
        int n;
        int minCount=0;
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            ArrayList<Integer> l = new ArrayList<Integer>();
            ArrayList<Integer> d = new ArrayList<Integer>();
            int[] a = new int[106];
            n=in.nextInt();
            for(int i=0;i<n;i++){
                int temp=in.nextInt();
                l.add(temp);
                a[temp]+=1;
            }
            for(int i=0;i<n;i++){
                int tmp=in.nextInt();
                d.add(tmp);
                minCount+=tmp;
            }
            for(int i=105;i>0;i--){
                int cost=0;
                ArrayList<Integer> cut =
                        new ArrayList<Integer>();
                if(a[i]>0){

                    if(a[i]*2<=n){
                        int cutNum = l.size()-a[i];
                        for(int j=i+1;j<106;j++){
                            cutNum-=a[j];
                        }
                        cutNum-=(a[i]-1);

                        for(int k=0;k<l.size();k++){
                            if(l.get(k)<i){
                                cut.add(d.get(k));
                            }
                            if(l.get(k)>i){
                                cost+=d.get(k);
                            }
                        }
                        if(cut.size()>0){
                            if(cutNum<=0){
                                cutNum=0;
                            }
                            Collections.sort(cut);
                            for(int k=0;k<cutNum;k++){
                                cost+=cut.get(k);
                            }
                            if(cost<minCount){
                                minCount=cost;
                            }
                        }
                    }else{
                        for(int k=0;k<l.size();k++){
                            if(l.get(k)>i){
                                cost+=d.get(k);
                            }
                        }
                    }
                    if(cost<minCount){

                        minCount=cost;
                    }
                }
            }
            System.out.println(minCount);
        }

    }
}