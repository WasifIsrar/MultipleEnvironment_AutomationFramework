package envConfig;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
	"classpath:resources/${env}.properties"
})
public interface Environment extends Config{
	String pin();
}
