package asset;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.asset.Asset;

public interface AssetRepository extends JpaRepository<Asset, String> {
}
