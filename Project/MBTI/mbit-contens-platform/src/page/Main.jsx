import LanguageIcons from "../components/main/LanguageIcons.jsx";
import MainBanner from "../components/main/MainBanner.jsx";
import CategoryButtons from "../components/main/CategoryButtons.jsx";
import ThumbnailList from "../components/main/ThumbnailList.jsx";

function Main() {
    return <div>
        <LanguageIcons />
        <MainBanner />
        <CategoryButtons />
        <ThumbnailList />
    </div>;
}

export default Main;