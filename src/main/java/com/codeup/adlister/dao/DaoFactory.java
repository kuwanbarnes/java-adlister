package com.codeup.adlister.dao;

import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static com.codeup.adlister.dao.Config config = new com.codeup.adlister.dao.Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
