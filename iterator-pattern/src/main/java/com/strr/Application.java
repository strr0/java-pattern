package com.strr;

import com.strr.code.Iterator;
import com.strr.code.container.NameRepository;

/**
 * 迭代器模式
 * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 */
public class Application {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
