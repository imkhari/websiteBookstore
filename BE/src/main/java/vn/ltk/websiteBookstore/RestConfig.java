package vn.ltk.websiteBookstore;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import vn.ltk.websiteBookstore.entity.CatalogBook;
import vn.ltk.websiteBookstore.entity.User;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    private String url = "http://localhost:8080";
    @Autowired
    private EntityManager entityManager;
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {


        // expose ids
        // Cho phép trả về id
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
        // config.exposeIdsFor(TheLoai.class);

        // Chặn các methods
        HttpMethod[] blockMethods ={
                HttpMethod.POST,
                HttpMethod.PUT,
                HttpMethod.PATCH,
                HttpMethod.DELETE,
        };
        disableHttpMethods(CatalogBook.class, config, blockMethods);

        // Chặn các method DELETE
        HttpMethod[] blockDelete = {
                HttpMethod.DELETE
        };
        disableHttpMethods(User.class, config,blockDelete );
    }

    private void disableHttpMethods(Class c,
                                    RepositoryRestConfiguration config,
                                    HttpMethod[] methods){
        config.getExposureConfiguration()
                .forDomainType(c)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(methods))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(methods));
    }
}