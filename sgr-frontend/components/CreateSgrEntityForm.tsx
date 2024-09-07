"use client";

import SgrEntity from "@/data/SgrEntity";
import { createSgrEntity } from "@/utils/server-actions";
import { useRouter } from "next/navigation";
import { useState } from "react";

export default function CreateSgrEntityForm() {
    const router = useRouter();
    const [sgrString, setSgrString] = useState<string>("");

    const onCreateSgrEntity = async (e) => {
        e.preventDefault();
        await createSgrEntity({ sgrString } as SgrEntity);
        setSgrString("");
        router.refresh();
    }

    return (
        <div>
            <input
                type="text"
                name="sgrString"
                value={sgrString}
                onChange={e => setSgrString(e.target.value)}
            />
            <button onClick={onCreateSgrEntity}>Create NEW</button>
        </div>
    );
}