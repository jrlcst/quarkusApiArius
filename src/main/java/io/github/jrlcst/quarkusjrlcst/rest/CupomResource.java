package io.github.jrlcst.quarkusjrlcst.rest;

import io.github.jrlcst.quarkusjrlcst.domain.model.Cupom;
import io.github.jrlcst.quarkusjrlcst.dto.CupomRequest;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.runtime.CustomCountPanacheQuery;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cupom")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CupomResource {

    @GET
    public Response queryCupom(CupomRequest request){
        Cupom cup = new Cupom();
        String select = ("select c.nroloja, c.NroCupom, c.Pdv, c.HoraMinSeg, c.NroItens, c.Troco, c.total from cupom c where c.NroCupom = '300369' and c.DataProc = '2022-04-14'");
        PanacheQuery<PanacheEntityBase> query = PanacheEntityBase.find(select);
        return Response.ok(query).build();
    }
}
