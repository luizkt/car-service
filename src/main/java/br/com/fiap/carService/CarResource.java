package br.com.fiap.carService;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(path = "cars", collectionResourceRel = "cars")
public interface CarResource extends PagingAndSortingRepository<Car, Integer> {

    List<Car> findCarByColor(@Param("color") String color);
}
