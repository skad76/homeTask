package com.sourceit.homework.task06;

import java.util.Date;
import java.util.Objects;

/**
 * Created by judge on 24.02.2015.
 */
public class Item implements Comparable {

    String header, body;
    Date cretionDate;

    public Date getCretionDate() {
        return cretionDate;
    }

    public void setCretionDate(Date cretionDate) {
        this.cretionDate = cretionDate;
    }

    public String getBody() {

        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHeader() {

        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Item);{
            Item i = (Item)o;

        return compareTo(i.header);
        }

    }
}
class News extends Item {
    String source [];

                }
class Advert extends Item {
    Date deadline;
}
class Article extends Item {
    String authors [];
}

