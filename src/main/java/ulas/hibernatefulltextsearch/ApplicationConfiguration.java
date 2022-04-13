package ulas.hibernatefulltextsearch;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ulas.hibernatefulltextsearch.repository.SearchRepositoryImpl;


@Configuration
@EnableJpaRepositories(repositoryBaseClass = SearchRepositoryImpl.class)
public class ApplicationConfiguration {
}
