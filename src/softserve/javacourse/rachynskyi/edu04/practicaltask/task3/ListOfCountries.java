package softserve.javacourse.rachynskyi.edu04.practicaltask.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListOfCountries {
    public String[] europeanCountries() {
        return new String[]{"germany", "united kingdom", "france", "italy", "spain", "poland", "ukraine", "romania", "netherlands", "belgium", "sweden", "czech republic", "czechia", "greece", "portugal", "hungary", "belarus", "austria", "switzerland", "serbia", "bulgaria", "denmark", "slovakia", "finland", "norway", "ireland", "croatia", "moldova", "bosnia and herzegovina", "albania", "lithuania", "slovenia", "north macedonia", "latvia", "estonia", "luxembourg", "montenegro", "malta", "iceland", "andorra", "liechtenstein", "monaco", "san marino", "holy see"};
    }

    ;

    public String[] asianCountries() {
        return new String[]{"india", "china", "indonesia", "pakistan", "bangladesh", "japan", "philippines", "vietnam", "iran", "turkey", "thailand", "myanmar", "south korea", "iraq", "afghanistan", "saudi arabia", "uzbekistan", "yemen", "malaysia", "nepal", "north korea", "syria", "sri lanka", "kazakhstan", "cambodia", "jordan", "azerbaijan", "tajikistan", "united arab emirates", "israel", "laos", "kyrgyzstan", "turkmenistan", "singapore", "state of palestine", "lebanon", "oman", "kuwait", "georgia", "mongolia", "armenia", "qatar", "bahrain", "timor-leste", "cyprus", "bhutan", "maldives", "brunei", "taiwan", "hong kong", "macao"};
    }

    ;

    public String[] northAmericaCountries() {
        return new String[]{"u.s.a.", "usa", "united states", "united states of america", "mexico", "canada", "guatemala", "haiti", "dominican republic", "cuba", "honduras", "nicaragua", "el salvador", "costa rica", "panama", "puerto rico", "jamaica", "trinidad and tobago", "bahamas", "belize", "guadeloupe", "martinique", "barbados", "curacao", "saint lucia", "grenada", "aruba", "saint vincent and the grenadines", "united states virgin islands", "antigua and barbuda", "dominica", "cayman islands", "bermuda", "greenland", "saint kitts and nevis", "turks and caicos islands", "sint maarten", "saint martin", "british virgin islands", "caribbean netherlands", "anguilla", "saint barthélemy", "saint pierre and miquelon", "montserrat"};
    }

    ;

    public String[] southAmericaCountries() {
        return new String[]{"brazil", "colombia", "argentina", "peru", "venezuela", "chile", "ecuador", "bolivia", "paraguay", "uruguay", "guyana", "suriname", "french guiana", "falkland islands"};
    }

    ;

    public String[] australianCountries() {
        return new String[]{"australia", "papua new guinea", "new zealand", "fiji", "solomon islands", "micronesia", "vanuatu", "french polynesia", "new caledonia", "samoa", "guam", "kiribati", "tonga", "northern mariana islands", "american samoa", "marshall islands", "palau", "cook islands", "nauru", "wallis and futuna islands", "tuvalu", "niue", "tokelau"};
    }

    ;

    public String[] africanCountries() {
        return new String[]{"nigeria", "ethiopia", "egypt", "dr congo", "tanzania", "south africa", "kenya", "uganda", "sudan", "algeria", "morocco", "angola", "ghana", "mozambique", "madagascar", "cote d'ivoire", "cameroon", "niger", "mali", "burkina faso", "malawi", "zambia", "chad", "somalia", "senegal", "zimbabwe", "guinea", "rwanda", "benin", "burundi", "tunisia", "south sudan", "togo", "sierra leone", "libya", "congo", "central african republic", "liberia", "mauritania", "eritrea", "gambia", "botswana", "namibia", "gabon", "lesotho", "guinea-bissau", "equatorial guinea", "mauritius", "eswatini", "djibouti", "comoros", "cabo verde", "sao tome & principe", "seychelles", "reunion", "western sahara", "mayotte", "saint helena"};
    }

    ;

    public String[] antarcticaCountries() {
        return new String[]{"antarctica"};
    }

    ;

}
