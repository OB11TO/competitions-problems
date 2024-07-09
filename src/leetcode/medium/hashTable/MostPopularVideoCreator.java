package leetcode.medium.hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostPopularVideoCreator {
    public static void main(String[] args) {
//        mostPopularCreator2(new String[]{"alice", "bob", "alice", "chris"}, new String[]{"one", "two", "three", "four"}, new int[]{5, 10, 5, 4});
//        mostPopularCreator2(new String[]{"lk","tg","mjiby","xw","mgw","xqb","wvfgv","bfyex","z","cs","xu","qm","cd","nrjqa","vpzma","vbi","dsm","lsv","xr","beqq","guuwi","gsgk","hdmik","qrc","p","xfb","kp","fv","zhlyo","lfkkb","k","gvpr","rhk","ib","nt","u","vmjbv","hxd","asa","xx","gifia","f","lcd","lk","yfnil","j","cwq","wpdx","uqd","embz","ubtyu","wa","em","yew","lxip","sehgk","i","bat","us","q","i","j","trep","qte","bda","ft","kmvd","faf","lq","dnn","nzx","yia","xev","d","erb","f","lutzh","qv","lb","z","hcj","gesac","figa","z","giiae","jf","dcx","gg","zo","wypsn","kvy","ayd","mr","bk","jxx","aw","aybh","scipa","jywew","l","zb","fxe","xxkq","fm","lyvb","qxd","yt","bzmk","si","ur","fkhpk","we","cfnpg","o","f","vvwq","pn","zjlpw","j","go","jyb","oxh","ogsj","jsxal","avrl","pro","vgsj","de","islbg","h","tz","pdk","jc","wwd","ttw","hjcm","pliwy","qlq","dpl","fzf","h","gu","jy","ewh","jtg","sryyo","rza","nj","qef","blda","b","dj","nlyq","nmro","rgdc","myhpp","f","ao","sp","jfgp","xkrzm","m","pwwk","jp","hkxpy","drt","kvmp","tdzpv","gws","wflh","gdd","cd","d","byro","it","k","glbr","ogxgx","krxn","qynod","wozr","qxw","k","zzy","kbai","zbulf","xduc","yoqqj","yuwoj","qyrwc","ze","tac","x","ax","ms","qjyf","e","i","e","syccn","bxvs","ebve","ifs","i","ulh","fwj","vbbc","hr"},
//                new String[]{"ckj","gi","trwck","phh","n","dms","zkpz","mj","uwb","lvu","cp","itfv","jlyjd","dx","qs","ch","muoux","clui","dzhye","hv","hsfwn","wgigs","mz","izilf","ujudb","yas","jck","qlzyi","b","fvqm","rxds","mjg","al","zejw","sxaa","xdiih","r","tnzf","cku","mfc","pvb","pq","su","d","mndx","raynr","yxji","vvva","uuh","plmgj","qozw","pur","ey","s","auxkh","fijju","yl","ydq","dof","kkoh","w","qb","px","v","fnf","w","nxi","ycbm","fa","pxlqg","hga","sqtzo","orw","fmjb","vil","uj","mrj","xmtbr","mabkb","twazb","gsfpl","dlz","nwb","vdq","a","afehi","i","lg","js","uzisb","i","zp","yvb","vpf","xei","hp","hncy","klj","fgxo","syft","y","fejos","qz","snpsn","ozj","ui","tkj","t","vcg","j","o","c","srd","eme","q","twuws","zizfn","lwprm","zqf","ag","pis","edegc","ejonr","bm","ufkj","p","gxjm","o","vjis","qhtn","irgg","pn","q","kkane","tv","ukm","nfve","qtqom","yjy","fwobb","hi","zbhp","wbp","wdwmw","ur","me","mktac","batqu","niivf","t","ajzw","ivgef","l","ynfrs","cti","b","r","y","caf","ixf","cutro","sjmxe","tfm","n","eonc","vu","hjrlh","wgn","fwa","n","flnz","udy","qihb","lxfto","blhjg","xy","a","m","nqie","vz","c","icmi","tjs","xaai","lvgi","rml","n","qk","ryxq","t","g","knqsl","p","gr","mu","twl","uv","vde","y","a","kvex","ij","jamy","yqb","wmv","c","b","pt"},
//                new int[]{376,145,866,200,99,919,173,532,678,463,909,442,288,970,271,688,123,904,661,501,414,86,390,656,739,201,182,504,60,880,206,136,409,820,753,135,554,232,81,988,513,374,891,319,597,232,693,234,851,255,155,788,166,929,484,270,342,903,848,60,201,840,966,466,250,181,932,383,981,670,406,626,835,890,151,668,421,160,26,913,748,416,526,76,388,132,389,390,974,908,362,708,846,482,980,30,33,148,897,588,784,742,268,219,274,86,203,523,36,808,302,322,997,620,763,598,941,432,49,977,715,552,916,772,822,391,848,436,660,21,694,218,430,378,476,169,545,312,606,678,210,429,365,749,650,490,985,945,649,888,213,582,871,130,735,951,972,63,755,926,376,663,103,726,616,539,718,861,824,583,486,574,12,933,470,123,980,906,722,148,363,581,887,938,236,133,749,377,935,592,365,986,19,684,220,230,996,477,231,890,273,755,138,347,69,374,118,170});
        mostPopularCreator2(new String[]{"u","ajf","n","kkmq","mwkim","p","ktjvr","ihmh","oulo","b","q","ofdim","rqbft","mdf","txt","xyjv","rlx","re","fyd","dq","frc","fag","xshlj","z","gii","z","le","fcvgf","yqbnk","vhke","udvp","rb","ppy","jywvl","xj","hb","ppqsq","waf","wpuw","qg","rnux","d","kxbcl","yoaqf","hnphp","w","nivm","hvymz","xze","bq","u","wbye","lmqoo","pc","q","t","jgiy","guv","fyc","ng","pvlg","aj","fhdo","maeu","zwfun","ravm","yypgx","cd","fkzmb","tvq","dm","aphdl","rbcp","dtcr","ehcv","k","c","hc","tg","wgin","mrrr","glr","fvxy","cap","xjjtq","hqp","bn","t","bc","cbbwf","ztxnz","xzmw","wsx","osim","m","cr","sp","s","v","he","mhcp","flz","owcx","zzi","p","wvvm","su","jp","qf","icqz","yy","k","jfv","qscyf","v","wj","nhlsi","r","vmd","nnbca","u","s","r","uoavb","qm","m","wio","ernca","h","bzrv"},
                new String[]{"z","w","scghn","mnmvy","xgnhf","khuxq","hei","wsowq","yae","cs","h","hyrrv","vli","pma","bxsh","xmm","qkimd","ut","fj","xyzw","scjsj","y","k","c","qgx","fgk","mg","rmgse","txsgi","fzn","z","t","ew","yi","wzitv","tqg","b","o","sesb","jpw","u","rwc","ermmg","rjsjw","qh","mqf","ax","anh","hanz","ooors","mv","shaca","doon","d","x","f","egmiy","lbfvj","edrsz","epwai","spvwi","xlh","eux","c","flw","udo","bmft","ohnl","o","novqs","l","vosc","nasy","p","vk","cx","krdo","zdusc","pm","pcc","ye","sx","cjjx","je","i","iywdt","sd","kmx","dfq","kcq","zbgjc","awvkp","utdq","wos","y","sch","jmsxr","aewo","ngy","b","tt","dfzb","db","nzm","fl","om","s","gmpa","ie","yj","nbey","v","yz","oqf","glo","daeig","wim","ay","d","qsgp","l","y","er","e","pz","wn","ys","upvkl","lzjn","fjs"},
                new int[]{29,383,953,680,836,892,572,308,987,154,409,689,693,144,187,104,95,683,987,723,196,220,429,194,840,201,408,283,329,530,657,73,897,888,261,177,32,87,948,752,367,190,546,575,223,936,549,367,148,350,217,393,989,834,730,425,799,835,325,960,749,809,842,270,172,731,567,739,707,581,261,106,409,63,576,27,288,693,567,950,967,400,552,869,456,579,355,392,977,394,945,423,529,804,243,308,508,218,210,155,857,875,838,283,632,641,17,80,688,780,403,300,846,65,315,132,437,898,460,374,526,870,421,696,669,133,17,937,200,377});
    }

    public static List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < creators.length; i++) {
            if (map.containsKey(creators[i])) {
                map.put(creators[i], map.get(creators[i]) + views[i]);
            } else {
                map.put(creators[i], views[i]);
            }
        }


        return null;
    }

    public static List<List<String>> mostPopularCreator2(String[] creators, String[] ids, int[] views) {

        Map<String, People> map = new HashMap<>();
        String video = "";
        for (int i = 0; i < creators.length; i++) {
            if (map.containsKey(creators[i])) {
                People people = map.get(creators[i]);
                if (people.getPreMax() < views[i]) {
                    video = ids[i];
                    people.setPreMax(views[i]);
                    people.setVideo(video);
                } else if (people.getPreMax() == views[i]){
                    video = (people.getVideo().compareTo(ids[i])) <= 0 ? people.getVideo() : ids[i];
                    people.setVideo(video);
                }
                people.setAllView(people.getAllView() + views[i]);
                map.put(creators[i], people);
            } else {
                map.put(creators[i], new People(ids[i], views[i], views[i]));
            }
        }
        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        int max = map.get(key).getAllView();
        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, People> entry : map.entrySet()) {
            String name = entry.getKey();
            if (entry.getValue().getAllView() == max) {
                resultList.add(Arrays.asList(name, entry.getValue().getVideo()));
            }
        }
        return resultList;
    }
}


class People implements Comparable<People> {
    String video;
    int allView;
    int preMax;

    People(String video, int allView, int preMax) {
        this.video = video;
        this.allView = allView;
        this.preMax = preMax;
    }

    People(String video, int allView) {
        this.video = video;
        this.allView = allView;
    }

    String getVideo() {
        return video;
    }

    int getAllView() {
        return allView;
    }

    int getPreMax() {
        return preMax;
    }

    void setPreMax(int preMax) {
        this.preMax = preMax;
    }

    void setVideo(String video) {
        this.video = video;
    }

    void setAllView(int allView) {
        this.allView = allView;
    }

    @Override
    public int compareTo(People o) {
        return this.allView - o.allView;
    }
}