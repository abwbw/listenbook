package com.blueice.listenbook.main;

/**
 * Created by wangbinwei on 2017/10/31.
 */

public interface MainContract {
    interface MainPresenter{
        void setView(MainView view);
        void refreshUser();
        void refreshContent();
    }

    interface MainView{
        void setPresenter(MainPresenter presenter);

        void refreshData();
    }
}
