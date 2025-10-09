import { useState}  from "react";
import {TESTS} from "../../data/TESTS.js";
import {Link} from "react-router-dom";
import {base_url} from "../../App.jsx";

function ThumbnailList() {
    const [testList] = useState(TESTS);
    return (
        <div>
            {/*이 이미지를 누르면 해당 테스트 Intro 페이지로 넘어가기*/}
            {testList?.map((test) => (
                <Link to={`${base_url}/${test?.info?.mainUrl}`} key={test?.info?.mainUrl}>
                <img
                    src={test?.info?.thumbImage}
                    alt={test?.info.mainUrl}
                    key={test?.info?.mainUrl}/>
                </Link>
            ))}
        </div>
    );
}

export default ThumbnailList;