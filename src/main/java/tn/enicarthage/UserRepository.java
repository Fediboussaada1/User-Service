package tn.enicarthage;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
interface UserRepository extends JpaRepository<Utilisateur, Long> {
	@Query("SELECT u FROM Utilisateur u WHERE u.login = ?1 and u.motdepasse = ?2")
	public Utilisateur rechercherUtilisateurParEmailAndPass(@Param("email")String email,@Param("pass")String pass);
}
