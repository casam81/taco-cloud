package casamsoftware.tacos;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import casamsoftware.tacos.Ingredient.Type;

public class IngredientByIdConverter implements Converter<String, Ingredient> {
	
	private Map<String, Ingredient> ingredientMap = new HashMap<>();
	
	public IngredientByIdConverter() {
		ingredientMap.put("FLTO", new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("COTO", new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
		ingredientMap.put("GRBF", new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
		ingredientMap.put("CARN", new Ingredient("CARN", "Carnitas", Type.PROTEIN));
		ingredientMap.put("TMTO", new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
		ingredientMap.put("LETC", new Ingredient("LETC", "Lettuces", Type.VEGGIES));
		ingredientMap.put("CHED", new Ingredient("CHED", "Cheddar", Type.CHEESE));
		ingredientMap.put("JACK", new Ingredient("JACK", "Monterray Jack", Type.CHEESE));
		ingredientMap.put("SLSA", new Ingredient("SLSA", "Salsa", Type.SAUCE));
		ingredientMap.put("SRCR", new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
	}

	@Override
	@Nullable
	public Ingredient convert(@NonNull String id) {		
		return ingredientMap.get(id);
	}

}
