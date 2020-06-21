
package com.maven3.Business;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.maven3.Database.DbUserInfo;
import com.maven3.DbModels.UserInfo;
import java.util.*;
/**
 *
 * @author prasa
 */
@Component
public class BUserInfo {
    private DbUserInfo _dbUserInfo;
     
    @Autowired
    public BUserInfo(DbUserInfo dbUserInfo)
    {
        _dbUserInfo = dbUserInfo;
    }
    
    public List<UserInfo> getAllUserInfo()
    {
        return null;
    }
    
    public int InsertUserInfo(UserInfo userInfo)
    {
       return _dbUserInfo.InsertUserInfo(userInfo);
    }
}
