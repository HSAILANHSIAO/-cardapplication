# -
標題:登入系統
-  動機>
-  透過登入畫面登入確認此用戶是否有申請過,
*  a.輸入資料正確會切換到登入成功
*  b.登入失敗,則會跳到失敗畫面,且必須重新申請
*  c.若資料重覆會跳到重新申請畫面






![image](https://github.com/user-attachments/assets/716adeb1-41bd-4402-86c3-caafcfa90062)
![image](https://github.com/user-attachments/assets/dc2b9299-d0ff-4177-813f-9b1d5fd63a9f)
![image](https://github.com/user-attachments/assets/7139b557-73bd-4484-b4f4-cef2d68081c8)
![image](https://github.com/user-attachments/assets/bee42aea-a5da-4d18-81cf-aa56703f7a5d)


*  MySQL表單:

![image](https://github.com/user-attachments/assets/d337241b-148c-40a6-8aa7-d9ed6868f771)

*  針對問題:

![image](https://github.com/user-attachments/assets/457c6822-35e6-423e-bfc1-b6e9c70f519a)

-  關於會先遇到專案資料夾上面顯示叉叉的Bug,處理方式:是把servlet掛進來(也把Juit掛入)

*  流程:
-  1.  先處理Index.jsp在處理Pom.xml
-  2.  開始加入資料夾>>
-  3.  新增folder>建立persistence.xml並連線設定
-  4.  model
-  5.  測試連線DbConnection
-  6.  把dao也加入並test也加入dao再測試



部署關鍵：
*  1.透過hibernate.cfg.xml連上資料庫
*  2.測試資料庫是否連線成功
*  3.把需要用的SQL先在轉成新增修改刪除
*  4.真正使用的在資料夾裡直接變成Bean後再給controller去呼叫
*  5.xml撰寫宣告bean物件
*  6.最後做管理操作設定,若帳號重覆,登入失敗就重新註冊,若登入輸入正確就登入成功.
*  7.要做的網頁頁面寫在webapp裡,index作為首頁登入畫面
*  8.使用struts2,系統會進行頁面重定向，將用戶引導到成功或錯誤頁面
