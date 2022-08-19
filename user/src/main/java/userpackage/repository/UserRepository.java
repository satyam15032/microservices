package userpackage.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import userpackage.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
