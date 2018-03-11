package io.nuls.api.server.resources.impl;

import io.nuls.api.client.entity.RpcClientResult;
import io.nuls.api.server.business.AliasBusiness;
import io.nuls.api.server.entity.Alias;
import io.nuls.api.server.entity.AliasParam;
import io.nuls.api.server.utils.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/report")
@Component
public class ReportResource {

    @Autowired
    private AliasBusiness aliasBusiness;

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public RpcClientResult loadBlock(@QueryParam("pageNumber") int pageNumber, @QueryParam("pageSize") int pageSize) {
        RpcClientResult result;
        try {
            AliasParam aliasParam = new AliasParam();
            AliasParam.Criteria criteria = aliasParam.createCriteria();
            criteria.andAddressIsNotNull();
            List<Alias> aliases = aliasBusiness.selectAliasList(aliasParam);
            result = RpcClientResult.getSuccess();
            result.setData(aliases);
        } catch (Exception e) {
            result = RpcClientResult.getFailed();
            Log.error(e);
        }
        return result;
    }

    @GET
    @Path("/save")
    @Produces(MediaType.APPLICATION_JSON)
    public RpcClientResult testInsert(@QueryParam("pageNumber") int pageNumber, @QueryParam("pageSize") int pageSize) {
        RpcClientResult result;
        try {
            Alias alias = new Alias();
            alias.setAddress("1a2f1134eb22b528673f7b");
            alias.setAlias("pierre-test");
            alias.setStatus((byte) 2);
            result = RpcClientResult.getSuccess();
            result.setData(aliasBusiness.insertSelective(alias));
        } catch (Exception e) {
            result = RpcClientResult.getFailed();
            Log.error(e);
        }
        return result;
    }



}
