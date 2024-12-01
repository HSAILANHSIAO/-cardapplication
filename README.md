# -
登入系統



1.透過hibernate.cfg.xml連上資料庫
2.DbConntionTest測試資料庫是否連線成功
3.把需要用的SQL先在Dao轉成CRUD
4.真正使用的在Service裡,在這裡直接變成Bean後再給controller去呼叫
5.Sp1.xml撰寫宣告bean物件(這裡就是把寫好的service直接變成Bean後再給controller去呼叫)
6.controller做管理操作設定,若帳號重覆,登入失敗就重新註冊,若登入輸入正確就登入成功.
7.要做的網頁頁面寫在webapp裡,index作為首頁登入畫面
8.使用struts2,系統會進行頁面重定向，將用戶引導到成功或錯誤頁面
